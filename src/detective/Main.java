package detective;

/**
 * <br>创建时间：2021/3/25.
 *
 * @author 5k5k
 */
public class Main {

    public static final String DEFAULT_SUBJECT_NAME = "test";

    public static void main(String[] args) {
        String subjectName = getSubjectName(args);
        Subject subject = SubjectManager.getInstance().getSubject(subjectName);
        subject.run();
    }

    private static String getSubjectName(String[] args) {
        return args.length > 0 ? args[0] : DEFAULT_SUBJECT_NAME;
    }
}
