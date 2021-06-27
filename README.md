# MyViewPager
## 史上最精简的ViewPager，TabLayout，Fragment交互封装：自定义ViewPager关联Fragment滑动，并关联TabLayout，且支持自定义Tablayout布局xml，支持禁用ViewPager滑动；【用最少的代码实现最全的功能；最少2行代码实现想要的功能】

## 一、XML布局：
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
      android:layout_height="50dp"   />  

     <com.chenliang.view.MyViewPager  
        android:id="@+id/viewpager"  
        android:layout_width="match_parent"  
        android:layout_height="match_parent" />  
  
</LinearLayout>
```
  
## 二、Activity代码,使用【默认TabLayout布局】，通常情况，第一步、第二步就可以满足你的需求；

```
var tabTitle = arrayListOf("tab1", "tab2", "tab3")  
    
//第一步：添加fragment,一次可添加一个、或多个fragment；addFragments()入参为可变参数
viewpager.addFragments(TestFragment(R.layout.fragment_1), TestFragment(R.layout.fragment_2),TestFragment(R.layout.fragment_3))  
    
//第二步：关联TabLayout，使用默认布局
viewpager.setTabLayout(tabLayout, tabTitle)  
     
//第三步：非必要，根据实际需求需要，添加viewpager，TabLayout选中事件，it为选中的position值  
viewpager.onPageSelected {   Toast.makeText(this, "ViewPager选中$it", Toast.LENGTH_SHORT).show()  }  
viewpager.onTabSelected {   Toast.makeText(this, "Tab选中$it", Toast.LENGTH_SHORT).show()  }
    
```

## 三、Activity代码,使用【自定义TabLayout布局】，通常情况，第一步、第二步就可以满足你的需求；
```
var tabTitle = arrayListOf("tab1", "tab2", "tab3")  
    
//第一步:添加fragment,一次可添加一个、或多个fragment；addFragments()入参为可变参数
viewpager.addFragments(TestFragment(R.layout.fragment_1), TestFragment(R.layout.fragment_2),TestFragment(R.layout.fragment_3))  
    
//第二步:关联TabLayout，使用自定义layout布局
viewpager.setTabLayout(tabLayout, tabTitle, R.layout.layout_tab) {  
    it.customView!!.button!!.text = tabTitle[it.position]  
}  
    
//第三步：非必要，根据实际需求需要，添加viewpager，TabLayout选中事件，it为选中的position值  
viewpager.onPageSelected {   Toast.makeText(this, "ViewPager选中$it", Toast.LENGTH_SHORT).show()  }  
viewpager.onTabSelected {   Toast.makeText(this, "Tab选中$it", Toast.LENGTH_SHORT).show()  }
```

## 效果：TabLayout默认布局；                        TabLayout自定义布局；
![Video_20210627_125652_338](https://user-images.githubusercontent.com/4067327/123533357-76294c80-d747-11eb-9eac-2587ca3eb38f.gif)   ![Video_20210627_125704_911](https://user-images.githubusercontent.com/4067327/123533375-92c58480-d747-11eb-9a3c-5dc7e3a63998.gif)



# 请资助我一个棒棒糖吧，在此感谢：

<img width="406" alt="微信图片_20210609173434" src="https://user-images.githubusercontent.com/4067327/121332592-989b2780-c94a-11eb-9543-a4e00db3b759.png">


 
