package com.dev.pipi.commlib.base.mvp;

import com.dev.pipi.commlib.base.BaseFragment;

/**
 * <pre>
 *     author : pipi
 *     e-mail : xxx@xx
 *     time   : 2018/09/03
 *     desc   : mvp基类fragment
 *     version: 1.0
 * </pre>
 */

public abstract class BaseMvpFragment<T extends BasePrsenter<BaseMvpFragment>> extends BaseFragment implements IView{
    protected T mBasePresenter;
    @Override
    protected void init() {
        mBasePresenter = getPresenter();
        mBasePresenter.attachView(this);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (mBasePresenter != null) {
            mBasePresenter.detachView();
        }
    }

    protected abstract T getPresenter();

}
