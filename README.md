#####使用样例
```java
public static final class TestDemo {
    private static final String MERCHANT_NO = "A***-******-******";
    private static final String PROVIDER_NO = "S*****";
    private static final String PRODUCT_NO = "P*****";
    private static final String TASK_CODE = "S*****";
    private static final String PRIVATE_KEY = "*****";
    private static final String SYSTEM_PUBLIC_KEY = "*****";

    private ClientConfig getClientConfig() throws Exception {
        return new ClientConfig(MERCHANT_NO,
                PROVIDER_NO,
                PRODUCT_NO,
                TASK_CODE,
                PRIVATE_KEY,
                SYSTEM_PUBLIC_KEY);
    }

    private SdkClient sdkClient() throws Exception {
        return new DefaultSdkClient(getClientConfig());
    }

    @Test
    public void testRegister() throws Exception {
        RegisterModel bizModel = RegisterModel.Builder.builder()
                .phone("*")
                .providerNo(getClientConfig().getProviderNo())
                .name("***")
                .idCard("********")
                .busType(BusType.ENTRUSTED_COLLECTED.getType())
                .build();
        RegisterRequest request = new RegisterRequest(bizModel);
        request.setFrontImg(new File("/Users/andrew/Pictures/sfz_f.jpeg"));
        request.setBgImg(new File("/Users/andrew/Pictures/sfz_b.jpeg"));
        ResponseVO<RegisterResponse> resp = sdkClient().execute(request);
        logger.info(JSON.toJSONString(resp));
    }

    @Test
    public void testOpenAcct() throws Exception {
        OpenAcctModel bizModel = OpenAcctModel.Builder.builder()
                .providerNo(getClientConfig().getProviderNo())
                .payPass("1")
                .memberId("****")
                .bankNo("*****")
                .cardNo("*******")
                .bankPhone("******")
                .ipAdr("192.168.1.35")
                .validDateStart("20150420")
                .validDateEnd("20250420")
                .address("福建省厦门市思明区高雄路69号")
                .build();
        OpenAcctRequest request = new OpenAcctRequest(bizModel);
        request.setImgFace(new File("/Users/andrew/Pictures/myface.jpeg"));
        final ResponseVO<OpenAcctResponse> resp = sdkClient().execute(request);
        logger.info(JSON.toJSONString(resp));
    }

    @Test
    public void testAcctQuery() throws Exception {
        QueryAcctModel bizModel = new QueryAcctModel();
        bizModel.setType(AcctQueryType.QRY_MEMBER_ID.getType());
        bizModel.setPayPass("2");
        bizModel.setIdCard("*****");
        QueryAcctRequest request = new QueryAcctRequest(bizModel);
        ResponseVO<QueryAcctResponse> resp = sdkClient().execute(request);
        logger.info(JSON.toJSONString(resp));
    }

    @Test
    public void testUpdateAcct() throws Exception {
        UpdateAcctModel bizModel = UpdateAcctModel
                .Builder
                .builder()
                .providerNo(getClientConfig().getProviderNo())
                .busType(BusType.INDIVIDUAL_REGISTRATION.getType())
                .phone("*****")
                .payPass("1")
                .merchantNo(getClientConfig().getMerchantNo())
                .changeType(AcctChangeType.CHG_IMAGE_PIECE.getChangeType())
                .memberId("*****")
                .build();
        UpdateAcctRequest request = new UpdateAcctRequest(bizModel);
        request.setIdCardFrontImg(new File("/Users/andrew/Pictures/sfz_f.jpeg"));
        final ResponseVO<UpdateAcctResponse> resp = sdkClient().execute(request);
        logger.info(JSON.toJSONString(resp));
    }

    @Test
    public void testQueryMerchant() throws Exception {
        final QueryAcctInfoRequest request = new QueryAcctInfoRequest("1");
        final ResponseVO<QueryAcctInfoResponse> resp = sdkClient().execute(request);
        logger.info(JSON.toJSONString(resp));
    }

    @Test
    public void testOrderQuery() throws Exception {
        OrderQueryRequest request = new OrderQueryRequest("123123123");
        ResponseVO<OrderQueryResponse> resp = sdkClient().execute(request);
        logger.info(JSON.toJSONString(resp));
    }

    @Test
    public void testOrderPay() throws Exception {
        PayInfoDetail pa = PayInfoDetail.Builder.builder()
                .idCard("*****")
                .name("*****")
                .fee("0.01")
                .memberId("*****")
                .build();
        List<PayInfoDetail> details = new ArrayList<>();
        details.add(pa);
        OrderPayModel bizModel = OrderPayModel.Builder
                .builder()
                .busType(BusType.INDIVIDUAL_REGISTRATION.getType())
                .batchNumber("1023010239190239")
                .merchantNo(getClientConfig().getMerchantNo())
                .productCode(getClientConfig().getProductNo())
                .taskCode(getClientConfig().getTaskCode())
                .providerNo(getClientConfig().getProviderNo())
                .payPass("1")
                .costUndertaker("1")
                .payList(details)
                .build();
        OrderPayRequest request = new OrderPayRequest(bizModel);
        final ResponseVO<OrderPayResponse> resp = sdkClient().execute(request);
        logger.info(JSON.toJSONString(resp));
    }

    @Test
    public void testSubOrderQuery() throws Exception {
        final SubOrderQueryRequest request = new SubOrderQueryRequest("1230123");
        final ResponseVO<SubOrderQueryResponse> resp = sdkClient().execute(request);
        logger.info(JSON.toJSONString(resp));
    }
}
```