package ro.pub.cs.systems.eim.lab04.contactsmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ContactsManagerActivity extends AppCompatActivity {
    private Button saveButton;
    private Button cancelButton;
    private EditText name;
    private EditText phone;
    private EditText email;
    private EditText address;

    private class ButtonClickListener implements View.OnClickListener {


        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.id_button_save:
                    String nameV = name.getText().toString();
                    String phoneV = phone.getText().toString();
                    String emailv = email.getText().toString();
                    String addressv = address.getText().toString();
                    break;
                case R.id.id_button_cancel:
                    finish();
                    break;
            }
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts_manager);

        saveButton = (Button)findViewById(R.id.id_button_save);
        saveButton.setOnClickListener(new ButtonClickListener());
        cancelButton = (Button)findViewById(R.id.id_button_cancel);
        name = (EditText)findViewById(R.id.editText);
        phone = (EditText)findViewById(R.id.editText2);
        email = (EditText)findViewById(R.id.editText3);
        address = (EditText)findViewById(R.id.editText4);
    }
}


