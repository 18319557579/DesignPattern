package chain_of_responsibility_pattern.purchase_order_approval;

//采购单审批案例
class Client {
    public static void main(String[] args) {
        Approver kangXi, yongZheng, qianLong, hanLinYuan;
        kangXi = new Director("康熙");
        yongZheng = new VicePresident("雍正");
        qianLong = new VicePresident("乾隆");
        hanLinYuan = new Congress("翰林院");

        //创建职责链
        kangXi.setSuccessor(yongZheng);
        yongZheng.setSuccessor(qianLong);
        qianLong.setSuccessor(hanLinYuan);

        //创建采购单
        PurchaseRequest pr1 = new PurchaseRequest(45000, 10001, "购买刀");
        kangXi.processRequest(pr1);

        PurchaseRequest pr2 = new PurchaseRequest(60000, 10002, "购买枪");
        kangXi.processRequest(pr2);

        PurchaseRequest pr3 = new PurchaseRequest(160000, 10003, "购买火炮");
        kangXi.processRequest(pr3);

        PurchaseRequest pr4 = new PurchaseRequest(800000, 10004, "购买军舰");
        kangXi.processRequest(pr4);
    }
}
