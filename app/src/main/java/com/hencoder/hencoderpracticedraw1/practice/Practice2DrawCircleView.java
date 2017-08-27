package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice2DrawCircleView extends View {

    private Paint paint;

    public Practice2DrawCircleView(Context context) {
        super(context);
        init(context);
    }

    private void init(Context context) {
        paint=new Paint(Paint.ANTI_ALIAS_FLAG);
    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);

    }

    public Practice2DrawCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(1);
        canvas.drawCircle(150, 150, 100, paint);
        canvas.translate(350,0);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(150, 150, 100, paint);
        canvas.translate(-350,0);
        canvas.translate(0,350);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(Color.BLUE);
        canvas.drawCircle(150, 150, 100, paint);
        canvas.translate(350,0);
        paint.setStrokeWidth(20);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(150, 150, 100, paint);
    //        练习内容：使用 canvas.drawCircle() 方法画圆
//        一共四个圆：1.实心圆 2.空心圆 3.蓝色实心圆 4.线宽为 20 的空心圆
    }
}
