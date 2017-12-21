package com.dewei.designmode;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 新增一个树节点的类
 * @author sa
 *
 */
public class TreeNode {
	private String name;
	private TreeNode parent;
	Vector<TreeNode> children = new Vector<TreeNode>();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public TreeNode getParent() {
		return parent;
	}
	
	public void setChildren(Vector<TreeNode> children) {
		this.children = children;
	}
	public void setParent(TreeNode parent) {
		this.parent = parent;
	}
	
	// 加叶子节点
	public void add(TreeNode node) {
		children.add(node);
	}
	// 移除子节点
	public void remove(TreeNode node) {
		children.remove(node);
	}
	public Enumeration<TreeNode> getChildren() {
		return children.elements();
	}
}
