import org.boundbox.BoundBox;
import org.boundbox.BoundBoxField;

@BoundBox(
			boundClass = TestClassWithSingleExtraField.class,
			extraFields = {
				@BoundBoxField(
						fieldName = "foo",
						fieldClass = String.class
				)
			}
)
public class TestClassWithSingleExtraField {
    //private String foo = "test";
}
