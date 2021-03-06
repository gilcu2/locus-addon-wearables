package com.asamm.locus.addon.wear.common.communication.containers;

import com.asamm.locus.addon.wear.common.communication.DataPath;

/**
 * Container wrapping both DataPath and Data to be sent
 * Created by Milan Cejnar on 16.11.2017.
 * Asamm Software, s.r.o.
 */

public class DataPayload<E extends TimeStampStorable> {
	private final DataPath mPath;
	private final E mStorable;

	public DataPayload(DataPath path, E storable) {
		this.mPath = path;
		this.mStorable = storable;
	}

	public DataPath getPath() {
		return mPath;
	}

	public E getStorable() {
		return mStorable;
	}
}
