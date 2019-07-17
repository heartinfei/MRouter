package com.apeman.mrouter.router;

import android.net.Uri;
import com.apeman.mrouter.LoginActivity;
import com.apeman.mrouter.tasks.LoginTask;
import com.apeman.route_lib.ActionTask;
import com.apeman.route_lib.MInterceptor;
import com.apeman.route_lib.Queryable;
import io.reactivex.Observable;

/**
 * 注解自动生成
 *
 * @author Rango on 2019-07-16 wangqiang@smzdm.com
 */
public class MRouter {

    /**
     * 通过Uri启动
     *
     * @param uri
     */
    public static void launchByUri(Uri uri) {

    }

    /**
     * 启动页面
     *
     * @param path
     * @return
     */
    public static LoginActivity.Launcher of(String path) {
        //TODO: 注解生成代码
        return LoginActivity.Launcher;
    }

    /**
     * 查询条件是否具备
     *
     * @param key
     * @return
     */
    public static Queryable<Boolean> query(String key) {
        return new LoginActivity();
    }

    /**
     * 执行一系列任务
     *
     * @param task
     * @return
     */
    public static TaskChain tasks(ActionTask task) {
        return new TaskChain(task);
    }

//    /**
//     * 通用方案但是会抹去类型信息
//     *
//     * @param path
//     * @param <T>
//     * @return
//     * @throws Exception
//     */
//    @SuppressWarnings("all")
//    public static <T> T ofCls(String path) throws Exception {
//        return ((T) Class.forName(path));
//    }

    /**
     * 添加拦截器，用于拦截 & 统计等
     */
    public static void addInterceptor(MInterceptor interceptor) {

    }

    public static class TaskChain {
        private ActionTask head;
        private ActionTask tail;

        public TaskChain(ActionTask head) {
            parseTask(head);
            if (this.head == null) {
                this.head = head;
            }
            if (this.tail == null) {
                this.tail = head;
            } else {
                this.tail.setNext(head);
            }
        }

        /**
         * 递归解析依赖关系
         *
         * @param t
         * @return
         */
        public TaskChain add(ActionTask t) {
            parseTask(t);
            tail.setNext(t);
            tail = t;
            return this;
        }

        /**
         * 通过 {@link com.apeman.route_lib.annotation.MTask}注解
         * 解析依赖关系将所有依赖关系的Task加入
         *
         * @param t
         */
        private void parseTask(ActionTask t) {
            ActionTask dependenceTask = new LoginTask();
            if (head == null) {
                head = dependenceTask;
            }
            if (tail != null) {
                tail.setNext(dependenceTask);
            }
            tail = dependenceTask;
        }

        public Observable<Boolean> exec() {
            return head.exec();
        }

    }
}
