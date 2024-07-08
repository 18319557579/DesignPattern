package chain_of_responsibility_pattern.class_task_case;

//班级任务案例
public class SchoolClient {
    public static void main(String[] args) {
        Handler headTeacher, monitor, studyCommissary;
        headTeacher = new HeadTeacher();
        monitor = new Monitor();
        studyCommissary = new StudyCommissary();

        headTeacher.setSuccessor(monitor);
        monitor.setSuccessor(studyCommissary);
        studyCommissary.setSuccessor(null);  //没有下一职责人

        startRequest(headTeacher, "one");
        startRequest(headTeacher, "two");
        startRequest(headTeacher, "three");
        startRequest(headTeacher, "four");
    }

    private static void startRequest(Handler headTeacher, String taskName) {
        if (! headTeacher.handleRequest(taskName)) {
            System.out.println("该班级处理不了此类任务！");
        }
    }
}
