package chain_of_responsibility_pattern.class_task_case;

class HeadTeacher extends Handler{
    @Override
    public boolean handleRequest(String taskName) {
        boolean handled = successor.handleRequest(taskName);
        if (handled) {
            return true;
        }
        if (taskName.equals("one") || taskName.equals("two") || taskName.equals("three")) {
            System.out.println("班主任处理了该事务");
            return true;
        }

        return false;
    }
}
