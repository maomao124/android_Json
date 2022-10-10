package mao.android_json;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.JsonWriter;
import android.util.Log;

import com.alibaba.fastjson.JSON;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;
import org.json.JSONTokener;

import mao.android_json.entity.Student;

public class MainActivity extends AppCompatActivity
{

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Student student = new Student()
//                .setId(10001)
//                .setName("张三")
//                .setSex("男")
//                .setAge(18);
//
//
//        Object json = JSON.toJSON(student);
//        Log.d(TAG, "onCreate: " + json);


        String json = "{\"age\":18,\"id\":10001,\"name\":\"张三\",\"sex\":\"男\"}";

        Student student = JSON.parseObject(json, Student.class);
        Log.d(TAG, "onCreate: \n" + student);

    }
}