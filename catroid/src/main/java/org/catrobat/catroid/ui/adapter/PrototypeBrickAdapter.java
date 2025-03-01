/*
 * Catroid: An on-device visual programming system for Android devices
 * Copyright (C) 2010-2022 The Catrobat Team
 * (<http://developer.catrobat.org/credits>)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * An additional term exception under section 7 of the GNU Affero
 * General Public License, version 3, is available at
 * http://developer.catrobat.org/license_additional_term
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.catrobat.catroid.ui.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import org.catrobat.catroid.content.bricks.Brick;

import java.util.List;

public class PrototypeBrickAdapter extends BaseAdapter {

	private List<Brick> brickList;

	public PrototypeBrickAdapter(List<Brick> brickList) {
		this.brickList = brickList;
	}

	@Override
	public int getCount() {
		return brickList.size();
	}

	@Override
	public Brick getItem(int position) {
		return brickList.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		return brickList.get(position).getPrototypeView(parent.getContext());
	}

	public void replaceList(List<Brick> list) {
		this.brickList = list;
		notifyDataSetChanged();
	}
}
