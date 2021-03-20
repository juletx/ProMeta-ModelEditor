package org.eclipse.xtext.uma.conversion;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.nodemodel.INode;

public class UmalConverter extends DefaultTerminalConverters {
	@ValueConverter(rule = "Uri")
	public IValueConverter<?> Uri() {
		return new IValueConverter<String>() {
			public String toValue(String string, INode node) {
				if (string == "") {
					return null;
				}
				else {
					return string;
				}
			}
			public String toString(String value) {
				if (value == null) {
					return "";
				}
				else {
					return value.toString();
				}
			}
		};
	}
};
