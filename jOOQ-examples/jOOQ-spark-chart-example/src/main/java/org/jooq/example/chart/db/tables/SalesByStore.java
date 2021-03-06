/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.chart.db.tables;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.example.chart.db.Public;
import org.jooq.example.chart.db.tables.records.SalesByStoreRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.0",
        "schema version:public_2"
    },
    date = "2018-04-03T12:47:15.287Z",
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SalesByStore extends TableImpl<SalesByStoreRecord> {

    private static final long serialVersionUID = 1908399090;

    /**
     * The reference instance of <code>public.sales_by_store</code>
     */
    public static final SalesByStore SALES_BY_STORE = new SalesByStore();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SalesByStoreRecord> getRecordType() {
        return SalesByStoreRecord.class;
    }

    /**
     * The column <code>public.sales_by_store.store</code>.
     */
    public final TableField<SalesByStoreRecord, String> STORE = createField("store", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.sales_by_store.manager</code>.
     */
    public final TableField<SalesByStoreRecord, String> MANAGER = createField("manager", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.sales_by_store.total_sales</code>.
     */
    public final TableField<SalesByStoreRecord, BigDecimal> TOTAL_SALES = createField("total_sales", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * Create a <code>public.sales_by_store</code> table reference
     */
    public SalesByStore() {
        this(DSL.name("sales_by_store"), null);
    }

    /**
     * Create an aliased <code>public.sales_by_store</code> table reference
     */
    public SalesByStore(String alias) {
        this(DSL.name(alias), SALES_BY_STORE);
    }

    /**
     * Create an aliased <code>public.sales_by_store</code> table reference
     */
    public SalesByStore(Name alias) {
        this(alias, SALES_BY_STORE);
    }

    private SalesByStore(Name alias, Table<SalesByStoreRecord> aliased) {
        this(alias, aliased, null);
    }

    private SalesByStore(Name alias, Table<SalesByStoreRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesByStore as(String alias) {
        return new SalesByStore(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesByStore as(Name alias) {
        return new SalesByStore(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SalesByStore rename(String name) {
        return new SalesByStore(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SalesByStore rename(Name name) {
        return new SalesByStore(name, null);
    }
}
