package com.example.carolynhemmings.simplecalculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //These two are the fields where user will input numbers
    private EditText operand1;
    private EditText operand2;

    //These are the buttons
    private Button additionBtn;
    private Button subtractionBtn;
    private Button divisionBtn;
    private Button multiplicationBtn;

    //This is the Result area
    private TextView txtTotal;

    //This is the reset button
    private Button clearBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //These are all the references - associate fields by ID
        operand1 = (EditText) findViewById(R.id.editOperand1);
        operand2 = (EditText) findViewById(R.id.editOperand2);
        additionBtn = (Button) findViewById(R.id.btnAddition);
        subtractionBtn = (Button) findViewById(R.id.btnSubtraction);
        divisionBtn = (Button) findViewById(R.id.btnDivision);
        multiplicationBtn = (Button) findViewById(R.id.btnMultiplication);
        txtTotal = (TextView) findViewById(R.id.txtResult);
        clearBtn = (Button) findViewById(R.id.btnClear);

        //Add listener for addition button
        additionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Make sure that two numbers have actually been entered
                if ((operand1.getText().length() > 0) && (operand2.getText().length() > 0)) {
                    //Next two lines grab the value that was entered on screen
                    //parse converts string to a number
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());

                    double total = oper1 + oper2;

                    //Put value of total into the result field and converts it back to a string
                    txtTotal.setText(Double.toString(total));
                } else {
                    Toast.makeText(MainActivity.this, "Please enter numbers in both operand fields", Toast.LENGTH_LONG).show();
                }
            }
        });

        //Add listener for subtraction button
        subtractionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Make sure that two numbers have actually been entered
                if ((operand1.getText().length() > 0) && (operand2.getText().length() > 0)) {
                    //Next two lines grab the value that was entered on screen
                    //parse converts string to a number
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());

                    double total = oper1 - oper2;

                    //Put value of total into the result field and converts it back to a string
                    txtTotal.setText(Double.toString(total));
                } else {
                    Toast.makeText(MainActivity.this, "Please enter numbers in both operand fields", Toast.LENGTH_LONG).show();
                }
            }
        });

        //Add listener for division button
        divisionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Make sure that two numbers have actually been entered
                if ((operand1.getText().length() > 0) && (operand2.getText().length() > 0)) {
                    //Next two lines grab the value that was entered on screen
                    //parse converts string to a number
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());

                    double total = oper1 / oper2;

                    //Put value of total into the result field and converts it back to a string
                    txtTotal.setText(Double.toString(total));
                } else {
                    Toast.makeText(MainActivity.this, "Please enter numbers in both operand fields", Toast.LENGTH_LONG).show();
                }
            }
        });

        //Add listener for multiplication button
        multiplicationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Make sure that two numbers have actually been entered
                if ((operand1.getText().length() > 0) && (operand2.getText().length() > 0)) {
                    //Next two lines grab the value that was entered on screen
                    //parse converts string to a number
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());

                    double total = oper1 * oper2;

                    //Put value of total into the result field and converts it back to a string
                    txtTotal.setText(Double.toString(total));
                } else {
                    Toast.makeText(MainActivity.this, "Please enter numbers in both operand fields", Toast.LENGTH_LONG).show();
                }
            }
        });

        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Clear the values of the operands and result
                operand1.setText("");
                operand2.setText("");
                txtTotal.setText("0.00");

                //This line moves cursor back to operand1
                operand1.requestFocus();
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

