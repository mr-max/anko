public fun android.support.v4.app.FragmentTabHost.onTabChanged(l: (tabId: String?) -> Unit) {
    setOnTabChangedListener(l)
}

public fun android.support.v4.widget.SwipeRefreshLayout.onRefresh(l: () -> Unit) {
    setOnRefreshListener(l)
}