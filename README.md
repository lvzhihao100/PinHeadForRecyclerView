######特点
* 使用ItemDecoration实现
* 两种悬浮方式
* 悬浮头部可以自定义,自己画
* 内置常见悬浮头部
###### 展示
  * 悬浮头不可推动  
  
![nopush_normal.gif](http://upload-images.jianshu.io/upload_images/4179767-86631c1c23f0920c.gif?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240) 

  * 悬浮头可推动    
  
![push_normal.gif](http://upload-images.jianshu.io/upload_images/4179767-dfbcb19890ec3114.gif?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240) 

 * 仿魅族手机电话本悬浮头可推动  
 
![push_mei.gif](http://upload-images.jianshu.io/upload_images/4179767-5bf0d440d5992331.gif?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240) 


###### 依赖

###### 使用方式
```
PInHeadItemDecoration floatingItemDecoration = new PInHeadItemDecoration();
        recyclerView.addItemDecoration(floatingItemDecoration);
        floatingItemDecoration
                .bgColor(context.getResources().getColor(R.color.hint_bg))//设置头部背景颜色
                .textSize(30 * WindowUtil.csw / WindowUtil.width)//设置画笔字体大小
                .titleHeight(40 * WindowUtil.csw / WindowUtil.width);//设置悬浮头部的高度
```
自定义悬浮头部,实现DecorationDrawer接口,
```
floatingItemDecoration.setDecorationDrawer(new DecorationDrawer() {
            //绘制滑动的头部
            @Override
            public void drawVertical(Canvas canvas, String s, float v, float v1, float v2, float v3, Paint paint, Paint paint1, float v4, int i) {

            }
            //绘制悬浮在最上面的头部
            @Override
            public void drawFlow(Canvas canvas, String s, float v, float v1, float v2, float v3, Paint paint, Paint paint1, float v4, int i) {

            }
        });
```
设置魅族样式悬浮头
```java
        floatingItemDecoration.setDecorationDrawer(new MeizuDecorationDrawer());
```
