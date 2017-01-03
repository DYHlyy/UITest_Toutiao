package com.example.lyy.uitest_toutiao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private List<Item> itemList=new ArrayList<>();
    private List<Fruit> fruitList=new ArrayList<>();

    private ImageView home;
    private ImageView faver;
    private ImageView mine;
    private ImageView vedio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initItem();
        initFruit();//初始化水果数据

        home= (ImageView) findViewById(R.id.home1);
        faver= (ImageView) findViewById(R.id.faver);
        mine= (ImageView) findViewById(R.id.mine);
        vedio= (ImageView) findViewById(R.id.vedio);

        home.setOnClickListener(this);
        faver.setOnClickListener(this);
        mine.setOnClickListener(this);
        vedio.setOnClickListener(this);

        RecyclerView recyclerView= (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);
        ItemAdapter adapter=new ItemAdapter(itemList);
        recyclerView.setAdapter(adapter);

        RecyclerView fruitView= (RecyclerView) findViewById(R.id.fruit_view);
        LinearLayoutManager fruitlayoutManager=new LinearLayoutManager(this);
        fruitView.setLayoutManager(fruitlayoutManager);
        FruitAdapter fruitadapter=new FruitAdapter(fruitList);
        fruitView.setAdapter(fruitadapter);


    }

    private void initItem() {
        Item item1=new Item("推荐");
        itemList.add(item1);
        Item item2=new Item("科技");
        itemList.add(item2);
        Item item3=new Item("视频");
        itemList.add(item3);
        Item item4=new Item("段子");
        itemList.add(item4);
        Item item5=new Item("历史");
        itemList.add(item5);
        Item item6=new Item("图片");
        itemList.add(item6);
        Item item7=new Item("问答");
        itemList.add(item7);
        Item item8=new Item("数码");
        itemList.add(item8);
        Item item9=new Item("情感");
        itemList.add(item9);
        Item item10=new Item("收藏");
        itemList.add(item10);
        Item item11=new Item("游戏");
        itemList.add(item11);
    }

    private void initFruit() {
        for(int i=0;i<3;i++){
            Fruit apple=new Fruit("Apple",R.drawable.apple);
            fruitList.add(apple);
            Fruit banana=new Fruit("Banana",R.drawable.banana);
            fruitList.add(banana);
            Fruit orange=new Fruit("Orange",R.drawable.orange);
            fruitList.add(orange);
            Fruit watermelon=new Fruit("Watermelon",R.drawable.watermelon);
            fruitList.add(watermelon);
            Fruit pear=new Fruit("Pear",R.drawable.pear);
            fruitList.add(pear);
            Fruit grape=new Fruit("Grape",R.drawable.grape);
            fruitList.add(grape);
            Fruit pineapple=new Fruit("pineapple",R.drawable.pineapple);
            fruitList.add(pineapple);
            Fruit cherry=new Fruit("cherry",R.drawable.cherry);
            fruitList.add(cherry);
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.mine:
                Toast.makeText(this.getBaseContext(),"这里是mine",Toast.LENGTH_SHORT).show();
                break;
            case R.id.faver:
                Toast.makeText(this.getBaseContext(),"这里是faver",Toast.LENGTH_SHORT).show();
                break;
            case R.id.vedio:
                Toast.makeText(this.getBaseContext(),"这里是vedio",Toast.LENGTH_SHORT).show();
                break;
            case R.id.home1:
                Toast.makeText(this.getBaseContext(),"这里是home",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
