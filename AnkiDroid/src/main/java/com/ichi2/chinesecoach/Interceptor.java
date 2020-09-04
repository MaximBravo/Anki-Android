package com.ichi2.chinesecoach;

import android.app.Notification;
import android.content.Context;

import com.ichi2.anki.NotificationChannels;
import com.ichi2.anki.R;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

public class Interceptor {
    public static void sendNotification(Context context, String text) {
        final NotificationManagerCompat notificationManager = NotificationManagerCompat.from(context);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(context,
                NotificationChannels.getId(NotificationChannels.Channel.CC_TEST))
                .setSmallIcon(R.drawable.ic_stat_notify)
                .setContentTitle("Content title: " + text)
                .setContentText("Content text: " + text)
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);

        Notification notification = builder.build();

        notificationManager.notify(1234, notification);
    }


    public static String ridStyleHtml(String question) {
        String endStyleTag = "</style>";
        return question.substring(question.indexOf(endStyleTag) + endStyleTag.length());
    }
}
