package com.bridgelabz.designpatterns.behavioral.visitor;

public interface ItemElement 
{
	public int accept(ShoppingCartVisitor visitor);
}
