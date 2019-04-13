package presenters;

import javax.annotation.Nonnull;

import views.IView;

public interface IPresenter {
    /**
     * Method that Initialises the presenter, injecting the view it controls.
     */

    void initialise();

    /**
     * Method loads data
     */

    void loadData();


    /**
     * Method that control the lifecycle of the view. It should be called in the view's
     * (Activity or Fragment) onResume() method.
     */
    void resume();

    /**
     * Method that control the lifecycle of the view. It should be called in the view's
     * (Activity or Fragment) onPause() method.
     */
    void pause();

    /**
     * Method that control the lifecycle of the view. It should be called in the view's
     * (Activity or Fragment) onDestroy() method.
     */
    void destroy();
}
