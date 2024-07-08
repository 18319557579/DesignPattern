package chain_of_responsibility_pattern.class_task_case;

abstract class Handler {
    protected Handler successor;  //定义后继对象

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public boolean handleRequest(String taskName) {
        if (successor == null) {
            return false;
        }
        return successor.handleRequest(taskName);
    }
}
