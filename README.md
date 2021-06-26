# MyViewPager
## 自定义ViewPager关联Fragment滑动，并关联TabLayout，且支持自定义Tablayout布局xml，支持禁用ViewPager滑动；【用最少的代码实现最全的功能；最少2行代码实现想要的功能】

## XML布局：
```
<?xml version="1.0" encoding="utf-8"?>  
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"  
  xmlns:app="http://schemas.android.com/apk/res-auto"  
  xmlns:tools="http://schemas.android.com/tools"  
  android:layout_width="match_parent"  
  android:layout_height="match_parent"  
  android:orientation="vertical"  
  tools:context=".MainActivity">  
  
   <com.google.android.material.tabs.TabLayout 
      android:id="@+id/tabLayout"  
      android:layout_width="match_parent"  
      android:layout_height="50dp"  
      app:tabMaxWidth="100dp"  
      app:tabRippleColor="#0000"  
      app:tabSelectedTextColor="#f00"  
      app:tabTextAppearance="@style/TabLayoutTheme"  
      app:tabTextColor="#43433C" />  

     <com.chenliang.view.MyViewPager  
        android:id="@+id/viewpager"  
        android:layout_width="match_parent"  
        android:layout_height="match_parent" />  
  
</LinearLayout>
```
  
## Activity代码：

```
     var tabTitle = arrayListOf("tab1", "tab2", "tab3")  
    /**  
     * 1、添加fragment:一次可添加一个、或多个fragment；addFragments()入参为可变参数
     */  
    viewpager.addFragments(TestFragment(R.layout.fragment_1))  
    viewpager.addFragments(TestFragment(R.layout.fragment_2), TestFragment(R.layout.fragment_3))  

    /**  
     * 1、1关联TabLayout方式一
     */
     viewpager.setTabLayout(tabLayout, tabTitle)  
    /**  
     * 1、2关联TabLayout方式二，可自定义layout布局
     */
     viewpager.setTabLayout(tabLayout, tabTitle, R.layout.layout_tab) {  
          it.customView!!.button!!.text = tabTitle[it.position]  
    }  
    /**  
     * 3、根据实际需求需要，添加viewpager选中事件  
      */  
    viewpager.onPageSelected {  
        Toast.makeText(this, "ViewPager选中$it", Toast.LENGTH_SHORT).show()  
    }  
    /**  
     * 4、根据实际需求需要，添加tabLayout选中事件  
      */  
    viewpager.onTabSelected {  
        Toast.makeText(this, "Tab选中$it", Toast.LENGTH_SHORT).show()  
    }
 
```

## 效果：
![Video_20210626_022307_926](https://user-images.githubusercontent.com/4067327/123504615-1cfce280-d68d-11eb-8fa8-da1eb827b933.gif)
![Video_20210626_022112_824](https://user-images.githubusercontent.com/4067327/123504612-179f9800-d68d-11eb-83b3-c191023beec3.gif)


# 请资助我一个棒棒糖吧，在此感谢：

<img width="406" alt="微信图片_20210609173434" src="https://user-images.githubusercontent.com/4067327/121332592-989b2780-c94a-11eb-9543-a4e00db3b759.png">


 
