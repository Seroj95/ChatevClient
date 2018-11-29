package ru.android.chatclient;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends ArrayAdapter<Message> {
    private final Context context;
    private final ArrayList<Message> messages;

    public MyAdapter(Context context, ArrayList<Message> messages) {
        super(context, R.layout.message, messages);
        this.context = context;
        this.messages = messages;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
   View messageView;
        LayoutInflater inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        messageView=inflater.inflate(R.layout.message,parent,false);
        TextView timeView=(TextView)messageView.findViewById(R.id.timeTextView);
        timeView.setText(messages.get(position).getTime());
        TextView msgView=(TextView)messageView.findViewById(R.id.messageTextView);
        msgView.setText(messages.get(position).getMessage());
    return messageView;
    }

}