// Decompiled by DJ v3.11.11.95 Copyright 2009 Atanas Neshkov  Date: 29/05/2011 11:20:29 p.m.
// Home Page: http://members.fortunecity.com/neshkov/dj.html  http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   DAOFactory.java

package dao.factory;

import interfaces.IBancoDAO;

// Referenced classes of package aprendamos.java.dao:
//            MySqlDAOFactory, XmlDAOFactory, OracleDAOFactory

public abstract class DAOFactory {
	
    public static final int MYSQL = 1;
    public static final int ORACLE = 2;
    public static final int DB2 = 3;
    public static final int SQLSERVER = 4;
    public static final int XML = 5;

	public DAOFactory() {
	}

	public abstract IBancoDAO getBancoDAO();

	public static DAOFactory getDAOFactory(int whichFactory) {
		switch (whichFactory) {
		case 1: // '\001'
			return new MySqlDAOFactory();

		case 5: // '\005'
			return new XmlDAOFactory();

		case 2: // '\002'
			return new OracleDAOFactory();

		case 3: // '\003'
		case 4: // '\004'
		default:
			return null;
		}
	}

}
