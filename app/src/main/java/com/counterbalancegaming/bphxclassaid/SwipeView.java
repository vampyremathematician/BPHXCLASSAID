package com.counterbalancegaming.bphxclassaid;

/**
 * Created by Nicholas on 3/13/2018.
 */



import android.content.Context;
import android.support.v4.view.GestureDetectorCompat;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.TextView;

/**
     * Created by Rob on 3/13/2018.
     */

    public class SwipeView extends android.support.v7.widget.AppCompatTextView implements GestureDetector.OnGestureListener {
        private GestureDetectorCompat mDetector;
        public SwipeView(Context context) {
            super(context);
            mDetector = new GestureDetectorCompat(context,this);
        }

        public interface SwipeDirectionListener{
            public void onUp();
            public void onDown();
            public void onLeft();
            public void onRight();
        }

        @Override
        public boolean onTouchEvent(MotionEvent event){
            if(this.mDetector.onTouchEvent(event)){
                return true;
            }
            return super.onTouchEvent(event);
        }

        @Override
        public boolean onDown(MotionEvent e) {
            return false;
        }

        @Override
        public void onShowPress(MotionEvent e) {

        }

        @Override
        public boolean onSingleTapUp(MotionEvent e) {
            return false;
        }

        @Override
        public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
            return false;
        }

        @Override
        public void onLongPress(MotionEvent e) {

        }

        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            //Check fling stuff
            //TODO: add checks to figure out direction and fire events
            return true;
        }
    }
}
