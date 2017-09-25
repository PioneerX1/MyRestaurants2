package compioneerx1.httpsgithub.myrestaurants.util;


public interface ItemTouchHelperAdapter {

    boolean onItemMove(int fromPosition, int toPosition);
    void onItemDismiss(int position);

}
