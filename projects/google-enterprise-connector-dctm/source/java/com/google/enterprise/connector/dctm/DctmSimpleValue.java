// Copyright (C) 2006 Google Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.enterprise.connector.dctm;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import com.google.enterprise.connector.dctm.dfcwrap.ISysObject;
import com.google.enterprise.connector.spi.RepositoryException;
import com.google.enterprise.connector.spi.SimpleValue;
import com.google.enterprise.connector.spi.Value;
import com.google.enterprise.connector.spi.ValueType;

/**
 * Simple convenience implementation of the spi.SimpleValue interface. This
 * class is not part of the spi - it is provided for developers to assist in
 * implementations of the spi.
 */
public class DctmSimpleValue extends SimpleValue implements Value {

	private final ISysObject sysObject;



	public DctmSimpleValue(ValueType t, String v) {
		super(t, v);
		sysObject = null;
	}

	public DctmSimpleValue(ValueType t, byte[] v) {
		super(t, v);
		sysObject = null;
	}

	public DctmSimpleValue(ValueType t, ISysObject v) {

		super(t, "");
		sysObject = v;
	}

	public InputStream getStream() throws IllegalArgumentException,
			IllegalStateException, RepositoryException {
		if (sysObject == null) {
			return super.getStream();
		} else {
			InputStream str = sysObject.getContent();
			if (str == null) {
				str = new ByteArrayInputStream(new byte[1]);
			}
			return str;
		}

	}



	public String getString() throws IllegalArgumentException,
			RepositoryException {
		return super.getString();
	}

	public long getLong() throws IllegalArgumentException, RepositoryException {
		return super.getLong();
	}

	public double getDouble() throws IllegalArgumentException,
			RepositoryException {
		return super.getDouble();
	}

	public boolean getBoolean() throws IllegalArgumentException,
			RepositoryException {
		return super.getBoolean();
	}

	public ValueType getType() throws RepositoryException {
		return super.getType();
	}
	

}
