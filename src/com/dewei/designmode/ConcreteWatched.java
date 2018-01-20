package com.dewei.designmode;

import java.util.ArrayList;

/**
 * 观察者模式
 * @author sa
 *
 */
public class ConcreteWatched implements Watched {
	
	private ArrayList<Watcher> list = new ArrayList<Watcher>();
	@Override
	public void addWatcher(Watcher watcher) {
		list.add(watcher);
	}

	@Override
	public void removeWatcher(Watcher watcher) {
		list.remove(watcher);
	}

	@Override
	public void notifyWatches(String msg) {
		for(Watcher watcher:list) {
			watcher.update(msg);
		}
	}

}
