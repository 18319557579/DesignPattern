package chain_of_responsibility_pattern;

import java.text.MessageFormat;

//副董事长：具体处理类
class VicePresident extends Approver{
    public VicePresident(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 100000) {
            System.out.println(
                    MessageFormat.format("副董事长 {0} 审批采购单:{1}, 金额:{2}元, 采购目的:{3}。",
                            this.name, request.getNumber(), request.getAmount(), request.getPurpose())
            );
        } else {
            this.successor.processRequest(request);
        }
    }
}
