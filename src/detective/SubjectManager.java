package detective;

import detective.collection.Test;

import java.util.HashMap;

/**
 * <br>创建时间：2021/3/25.
 *
 * @author 5k5k
 */
public class SubjectManager {

    private final HashMap<String, Subject> subjects;

    private SubjectManager() {
        subjects = new HashMap<>();
        subjects.put("test", new Test());
    }

    private static final SubjectManager INSTANCE = new SubjectManager();

    public static SubjectManager getInstance() {
        return INSTANCE;
    }

    public Subject getSubject(String subjectName) {
        if (!subjects.containsKey(subjectName)) {
            throw new IllegalArgumentException("课题名称错误");
        }
        return subjects.get(subjectName);
    }
}
