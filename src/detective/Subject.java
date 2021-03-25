package detective;

/**
 * <br>创建时间：2021/3/25.
 *
 * @author 5k5k
 */
public abstract class Subject {

    /**
     * 课题执行
     */
    public void run() {
        System.out.println(this.getClass().getName());

    }

}
