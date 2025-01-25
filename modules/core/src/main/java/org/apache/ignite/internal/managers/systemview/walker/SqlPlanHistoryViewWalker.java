/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.ignite.internal.managers.systemview.walker;

import java.util.Date;
import org.apache.ignite.spi.systemview.view.SqlPlanHistoryView;
import org.apache.ignite.spi.systemview.view.SystemViewRowAttributeWalker;

/**
 * Generated by {@code org.apache.ignite.codegen.SystemViewRowAttributeWalkerGenerator}.
 * {@link SqlPlanHistoryView} attributes walker.
 * 
 * @see SqlPlanHistoryView
 */
public class SqlPlanHistoryViewWalker implements SystemViewRowAttributeWalker<SqlPlanHistoryView> {
    /** {@inheritDoc} */
    @Override public void visitAll(AttributeVisitor v) {
        v.accept(0, "schemaName", String.class);
        v.accept(1, "sql", String.class);
        v.accept(2, "plan", String.class);
        v.accept(3, "local", boolean.class);
        v.accept(4, "engine", String.class);
        v.accept(5, "lastStartTime", Date.class);
    }

    /** {@inheritDoc} */
    @Override public void visitAll(SqlPlanHistoryView row, AttributeWithValueVisitor v) {
        v.accept(0, "schemaName", String.class, row.schemaName());
        v.accept(1, "sql", String.class, row.sql());
        v.accept(2, "plan", String.class, row.plan());
        v.acceptBoolean(3, "local", row.local());
        v.accept(4, "engine", String.class, row.engine());
        v.accept(5, "lastStartTime", Date.class, row.lastStartTime());
    }

    /** {@inheritDoc} */
    @Override public int count() {
        return 6;
    }
}
