/*
 * Tanaguru - Automated webpage assessment
 * Copyright (C) 2008-2011  Open-S Company
 *
 * This file is part of Tanaguru.
 *
 * Tanaguru is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Contact us by mail: open-s AT open-s DOT com
 */package org.opens.tanaguru.entity.subject;

import org.opens.tanaguru.sdk.entity.Entity;
import java.util.Collection;
import org.opens.tanaguru.entity.audit.Audit;
import org.opens.tanaguru.entity.audit.ProcessResult;

/**
 * 
 * @author jkowalczyk
 */
public interface WebResource extends Entity {

    /**
     *
     * @return
     *      the audit associated with the audit
     */
    Audit getAudit();

    /**
     *
     * @return the label
     */
    String getLabel();

    /**
     * 
     * @return the container
     */
    Site getParent();

    /**
     *
     * @return the URL
     */
    String getURL();

    /**
     *
     * @return the mark
     */
    float getMark();

    /**
     *
     * @param audit
     */
    void setAudit(Audit audit);

    /**
     *
     * @param label
     *            the label to set
     */
    void setLabel(String label);

    /**
     *
     * @param container
     *            the container to set
     */
    void setParent(Site container);

    /**
     *
     * @param url
     *            the URL to set
     */
    void setURL(String url);

    /**
     *
     * @return the process result list
     */
    Collection<? extends ProcessResult> getProcessResultList();

    /**
     *
     * @param processResultList the process result Collection to set
     */
    void setProcessResultList(Collection<? extends ProcessResult> processResultList);

    /**
     *
     * @param mark
     *            the mark to set
     */
    void setMark(float mark);

    /**
     *
     * @param processResult the process result to add
     */
    void addProcessResult(ProcessResult processResult);

    /**
     *
     * @param processResultList the process result Collection to add
     */
    void addAllProcessResult(Collection<? extends ProcessResult> processResultList);

}