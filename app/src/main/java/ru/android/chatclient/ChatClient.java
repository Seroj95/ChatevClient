package ru.android.chatclient;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Date;

public class ChatClient extends AppCompatActivity implements View.OnClickListener {
    Button sendButton;
    EditText messageText;
    ListView messageList;
    MyAdapter mAdapter = null;
    ArrayList<Message> messages = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_client);
        sendButton = (Button) findViewById(R.id.sendButton);
        sendButton.setOnClickListener(this);
        messageText=(EditText)findViewById(R.id.messageText);
        messageList=(ListView)findViewById(R.id.messageList);
        messages=new ArrayList<Message>();
        mAdapter=new MyAdapter(this,messages);
        messageList.setAdapter((ListAdapter)mAdapter);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.sendButton:
                String messString = messageText.getText().toString();
                if (!messString.equals("")) {
              Message message=new Message("   ",messString,true,new Date());
              messages.add(message);
              mAdapter.notifyDataSetChanged();
              message=null;
              messageText.setText("    ");

                }
                break;
            default:
                break;
        }
    }
}