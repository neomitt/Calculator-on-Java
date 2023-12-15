# Calculator-on-Java

![Screenshot](https://github.com/neomitt/Calculator-on-Java/blob/main/screen1.png)
## Interface
![Screenshot](https://github.com/neomitt/Calculator-on-Java/blob/main/screen2.png)
![Screenshot](https://github.com/neomitt/Calculator-on-Java/blob/main/screen3.png)
## Code fragment
```java
    public class MainActivity extends AppCompatActivity {

    private EditText editText1;
    private EditText editText2;
    private TextView an;

    @SuppressLint("MissingInflatedId")
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = findViewById(R.id.num1);
        editText2 = findViewById(R.id.num2);
        an = findViewById(R.id.Answer);
    }

    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.buttonPlus) {
            double a = Double.parseDouble(String.valueOf(editText1.getText()));
            double b = Double.parseDouble(String.valueOf(editText2.getText()));
            double s = a + b;
            an.setText(a + "+" + b + "=" + s);
        } else if (id == R.id.buttonMinus) {
            double a = Double.parseDouble(String.valueOf(editText1.getText()));
            double b = Double.parseDouble(String.valueOf(editText2.getText()));
            double s = a - b;
            an.setText(a + "-" + b + "=" + s);
        } else if (id == R.id.buttonDelen) {
            double a = Double.parseDouble(String.valueOf(editText1.getText()));
            double b = Double.parseDouble(String.valueOf(editText2.getText()));
            if (b != 0) {
                double s = a / b;
                an.setText(a + "/" + b + "=" + s);
            } else {
                an.setText("Er");
            }

        }
        else if (id == R.id.buttonUmn) {
            double a = Double.parseDouble(String.valueOf(editText1.getText()));
            double b = Double.parseDouble(String.valueOf(editText2.getText()));
            double s = a * b;
            an.setText(a + "*" + b + "=" + s);
        }
        else if (id == R.id.buttonClear) {
            editText1.setText("");
            editText2.setText("");
            an.setText("0");
        }
        else if (id == R.id.buttonExit) {
            finish();
        }
    }
}
```
### [Github teachers: gomarmadi](https://github.com/gomarmadi)
