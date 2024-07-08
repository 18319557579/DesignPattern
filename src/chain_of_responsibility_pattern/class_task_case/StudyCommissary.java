package chain_of_responsibility_pattern.class_task_case;

class StudyCommissary extends Handler{
    @Override
    public boolean handleRequest(String taskName) {
        boolean handled;
        if (successor == null) {
            handled = false;
        } else {
            handled = successor.handleRequest(taskName);
        }

        if (handled) {
            return true;
        }
        if (taskName.equals("one")) {
            System.out.println("学习委员处理了该事务");
            return true;
        }

        return false;
    }
}
