/* ListitemRenderer.java

{{IS_NOTE
	Purpose:
		
	Description:
		
	History:
		Wed Aug 17 17:44:13     2005, Created by tomyeh
}}IS_NOTE

Copyright (C) 2005 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
	This program is distributed under GPL Version 2.0 in the hope that
	it will be useful, but WITHOUT ANY WARRANTY.
}}IS_RIGHT
*/
package org.zkoss.zul;

/**
 * Identifies components that can be used as "rubber stamps" to paint
 * the cells in a {@link Listbox}.
 *
 * <p>If you need better control, your renderer can also implement
 * {@link ListitemRendererExt}.
 *
 * <p>In addition, you could also
 * implement {@link RendererCtrl}. For example, starts an transaction,
 * and uses it to render all items for the same request.
 *
 * @author tomyeh
 * @see ListModel
 * @see Listbox
 * @see ListitemRendererExt
 */
public interface ListitemRenderer {
	/** Renders the data to the specified list item.
	 *
	 * @param item the listitem to render the result.
	 * Note: when this method is called, the listitem has no child
	 * at all, unless you implement {@link ListitemRendererExt#shallDetachOnRender}
	 * to return false.
	 * You can invoke {@link Listitem#setLabel} to create
	 * {@link Listcell} implicitly, or create one or multiple
	 * {@link Listcell} explicitly.
	 * @param data that is returned from {@link ListModel#getElementAt}
	 */
	public void render(Listitem item, Object data) throws Exception;
}
