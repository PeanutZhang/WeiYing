package com.zcy.ghost.vivideo.presenter.contract;


import com.zcy.ghost.vivideo.base.BasePresenter;
import com.zcy.ghost.vivideo.base.BaseView;
import com.zcy.ghost.vivideo.model.bean.VideoRes;

/**
 * Description: RecommendContract
 * Creator: yxc
 * date: 2016/9/21 15:53
 */
public interface DiscoverContract {

    interface View extends BaseView<Presenter> {

        boolean isActive();

        void showContent(VideoRes videoRes);

        void refreshFaild(String msg);

        void hidLoading();
    }

    interface Presenter extends BasePresenter {
        void getData();
    }
}
