package chain_of_responsibility_pattern.purchase_order_approval;

import java.text.MessageFormat;

//董事会类：具体处理者
class Congress extends Approver{
    public Congress(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        System.out.println(
                MessageFormat.format("召开董事会 审批采购单:{0}, 金额:{1}元, 采购目的:{2}。",
                        request.getNumber(), request.getAmount(), request.getPurpose())
        );
    }
}
