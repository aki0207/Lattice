package com.example.lattice;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TableLayoutのグループを取得
        ViewGroup w_view_group = (ViewGroup) findViewById(R.id.search_table);

        // Header部追加
        String[] w_header_array = "項目,金額".split(",");
        getLayoutInflater().inflate(R.layout.layout_table, w_view_group);
        TableRow w_table_row = (TableRow) w_view_group.getChildAt(0);


        // 配列分ループ(header部)
        for (int i = 0; i < w_header_array.length; i++) {
            ((TextView) (w_table_row.getChildAt(i))).setText(w_header_array[i]);
            ((TextView) (w_table_row.getChildAt(i))).setTypeface(Typeface.DEFAULT_BOLD);
        }

        // 背景色変更
        w_table_row.setBackgroundColor(Color.parseColor("#72CFF7"));




        //こいつがたぶんdbの検索結果いれる箱になるかと
        String[][] array_test = new String[2][2];

        array_test[0][0] = "生活費";
        array_test[0][1] = "3000";
        array_test[1][0] = "交遊費";
        array_test[1][1] = "200";




        for(int i = 0; i < 2; i++) {

            getLayoutInflater().inflate(R.layout.layout_table, w_view_group);
            // 文字設定
            w_table_row = (TableRow) w_view_group.getChildAt(i + 1);

            for (int j = 0; j < 2; j++) {

                ((TextView) (w_table_row.getChildAt(j))).setText(array_test[i][j]);
            }
        }








    }
}
