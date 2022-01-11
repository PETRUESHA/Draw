package com.example.myapplication;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

public class MyView extends View {

    public MyView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint pen = new Paint();
        pen.setColor(Color.GREEN);
        pen.setAntiAlias(true);
        pen.setStrokeWidth(30);
        pen.setStyle(Paint.Style.FILL);
        canvas.drawColor(Color.WHITE);
        canvas.drawRect(0, 1400, getWidth(), getHeight(), pen);
        pen.setColor(Color.GRAY);
        pen.setStyle(Paint.Style.FILL);
        int bench_width = getWidth() / 4 * 3;
        canvas.drawRect(bench_width, 1600, bench_width + 200, 1650, pen);
        canvas.drawRect(bench_width + 20, 1650, bench_width + 80, 1700, pen);
        canvas.drawRect(bench_width + 120, 1650, bench_width + 180, 1700, pen);
        pen.setColor(Color.parseColor("#79553D"));
        canvas.drawRect(bench_width - 200, 1800, bench_width - 160, 1200, pen);
        pen.setColor(Color.parseColor("#44944A"));
        canvas.drawOval(bench_width - 400, 1200, bench_width + 40, 600, pen);
        pen.setColor(Color.YELLOW);
        canvas.drawCircle(100, 100, 200, pen);
        pen.setStrokeWidth(4);
        canvas.drawLine(200, 200, 600, 300, pen);
        canvas.drawLine(200, 200, 600, 500, pen);
        canvas.drawLine(200, 150, 600, 100, pen);
        canvas.drawLine(200, 200, 300, 600, pen);
        pen.setColor(Color.parseColor("#8B6D5C"));
        canvas.drawRect(20, 2000, getWidth() / 2, 1500, pen);
        pen.setColor(Color.parseColor("#9F8170"));
        Path path = new Path();
        path.moveTo(20, 1500);
        path.lineTo(getWidth() / 4 + 20, 1000);
        path.lineTo(getWidth() / 2, 1500);
        pen.setStyle(Paint.Style.FILL);
        canvas.drawPath(path, pen);
        pen.setColor(Color.parseColor("#78DBE2"));
        canvas.drawCircle(getWidth() / 4 + 20, 1300, 80, pen);
        pen.setColor(Color.parseColor("#9F8170"));
        canvas.drawRect(getWidth() / 4 + 50, 1950, getWidth() / 2 - 50, 1600, pen);
        pen.setColor(Color.parseColor("#3D2B1F"));
        canvas.drawLine(getWidth() / 4 + 20, 1380, getWidth() / 4 + 20, 1220, pen);
        canvas.drawLine(getWidth() / 4 - 60, 1300, getWidth() / 4 + 100, 1300, pen);
        canvas.drawCircle(getWidth() / 2 - 90, 1800, 10, pen);
        pen.setColor(Color.YELLOW);
        canvas.drawRect(60, 1600, getWidth() / 4, 1800, pen);
        pen.setColor(Color.parseColor("#3D2B1F"));
        canvas.drawLine(60, 1700, getWidth() / 4, 1700, pen);
        canvas.drawLine((getWidth() / 4 - 110), 1600, (getWidth() / 4 - 110), 1800, pen);
    }
}
