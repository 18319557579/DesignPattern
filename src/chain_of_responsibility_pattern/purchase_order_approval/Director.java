package chain_of_responsibility_pattern.purchase_order_approval;

import java.text.MessageFormat;

//主任: 具体处理者
class Director extends Approver{
    public Director(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 50000) {
            System.out.println(
                    MessageFormat.format("主任 {0} 审批采购单:{1}, 金额:{2}元, 采购目的:{3}。",
                            this.name, request.getNumber(), request.getAmount(), request.getPurpose())
            );
        } else {
            this.successor.processRequest(request);  //转发请求
        }
    }
}
