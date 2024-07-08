package chain_of_responsibility_pattern.purchase_order_approval;

//审批者类: 抽象处理者
abstract class Approver {
    protected Approver successor;  //定义后继对象
    protected String name;  //审批者姓名

    public Approver(String name) {
        this.name = name;
    }

    //设置后继者
    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }

    public abstract void processRequest(PurchaseRequest request);
}
