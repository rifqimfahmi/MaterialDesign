package com.renotekno.app1.materialdesign.RecyclerViewAdapter;

import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.renotekno.app1.materialdesign.R;
import com.renotekno.app1.materialdesign.data.DataUtil;
import com.renotekno.app1.materialdesign.data.DummyData;

import java.util.List;

/**
 * Created by zcabez on 14/08/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private Context mContext;
    private List<DummyData> dummyDatas;

    public interface onItemClick {};

    public MyAdapter(Context context, List<DummyData> datas) {
        mContext = context;
        dummyDatas = datas;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.bindView(position);
    }

    @Override
    public int getItemCount() {
        return dummyDatas.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView title;
        private TextView desc;
        private int greenBg;
        private int whiteBg;

        public MyViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.titleTextView);
            desc = (TextView) itemView.findViewById(R.id.descTextView);

            itemView.setOnClickListener(this);

            if (greenBg == 0) {
                greenBg = ContextCompat.getColor(itemView.getContext(), R.color.itemColor);
            }
            if (whiteBg == 0) {
                whiteBg = ContextCompat.getColor(itemView.getContext(), android.R.color.white);
            }
        }


        public void bindView(int position) {
            Log.d("DATA_SIZE", dummyDatas.size() + ", " + position);
            title.setText(dummyDatas.get(position).getTitle());
            desc.setText(dummyDatas.get(position).getDesc());
        }

        @Override
        public void onClick(final View view) {
            boolean isBacon = view.getBackground() != null && ((ColorDrawable) view.getBackground()).getColor() == whiteBg;

            int finalRadius = (int) Math.hypot(view.getWidth() / 2, view.getHeight() /2);

            if (isBacon) {
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    Animator anim = ViewAnimationUtils.createCircularReveal(view, view.getWidth() / 2, view.getHeight() / 2, 0, finalRadius);

                    title.setText(DataUtil.veggie);
                    desc.setText(DataUtil.veggieDesc);
                    view.setBackgroundColor(greenBg);

                    anim.start();
                }
            } else {

                title.setText(DataUtil.bacon);
                desc.setText(DataUtil.baconDesc);
                view.setBackgroundColor(whiteBg);

//                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
//                    Animator anim = ViewAnimationUtils.createCircularReveal(view, view.getWidth() / 2, view.getHeight() / 2, finalRadius, 0);
//
//                    anim.addListener(new Animator.AnimatorListener() {
//                        @Override
//                        public void onAnimationStart(Animator animation) {
//
//                        }
//
//                        @Override
//                        public void onAnimationEnd(Animator animation) {
//                        }
//
//                        @Override
//                        public void onAnimationCancel(Animator animation) {
//
//                        }
//
//                        @Override
//                        public void onAnimationRepeat(Animator animation) {
//
//                        }
//                    });
//
//                    anim.start();
//                }
            }
        }
    }
}
