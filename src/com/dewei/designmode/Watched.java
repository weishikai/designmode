package com.dewei.designmode;
/**
 * 观察者模式
 * @author sa
 *
 */
public interface Watched {
	void addWatcher(Watcher watch);
	void removeWatcher(Watcher watch);
	void notifyWatches(String msg);
}
