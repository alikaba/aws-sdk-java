/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Specific settings required by destination type. Note that burnin_destination_settings are not available if the source
 * of the caption data is Embedded or Teletext.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/CaptionDestinationSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CaptionDestinationSettings implements Serializable, Cloneable, StructuredPojo {

    private BurninDestinationSettings burninDestinationSettings;

    private String destinationType;

    private DvbSubDestinationSettings dvbSubDestinationSettings;

    private SccDestinationSettings sccDestinationSettings;

    private TeletextDestinationSettings teletextDestinationSettings;

    private TtmlDestinationSettings ttmlDestinationSettings;

    /**
     * @param burninDestinationSettings
     */

    public void setBurninDestinationSettings(BurninDestinationSettings burninDestinationSettings) {
        this.burninDestinationSettings = burninDestinationSettings;
    }

    /**
     * @return
     */

    public BurninDestinationSettings getBurninDestinationSettings() {
        return this.burninDestinationSettings;
    }

    /**
     * @param burninDestinationSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionDestinationSettings withBurninDestinationSettings(BurninDestinationSettings burninDestinationSettings) {
        setBurninDestinationSettings(burninDestinationSettings);
        return this;
    }

    /**
     * @param destinationType
     * @see CaptionDestinationType
     */

    public void setDestinationType(String destinationType) {
        this.destinationType = destinationType;
    }

    /**
     * @return
     * @see CaptionDestinationType
     */

    public String getDestinationType() {
        return this.destinationType;
    }

    /**
     * @param destinationType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CaptionDestinationType
     */

    public CaptionDestinationSettings withDestinationType(String destinationType) {
        setDestinationType(destinationType);
        return this;
    }

    /**
     * @param destinationType
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CaptionDestinationType
     */

    public CaptionDestinationSettings withDestinationType(CaptionDestinationType destinationType) {
        this.destinationType = destinationType.toString();
        return this;
    }

    /**
     * @param dvbSubDestinationSettings
     */

    public void setDvbSubDestinationSettings(DvbSubDestinationSettings dvbSubDestinationSettings) {
        this.dvbSubDestinationSettings = dvbSubDestinationSettings;
    }

    /**
     * @return
     */

    public DvbSubDestinationSettings getDvbSubDestinationSettings() {
        return this.dvbSubDestinationSettings;
    }

    /**
     * @param dvbSubDestinationSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionDestinationSettings withDvbSubDestinationSettings(DvbSubDestinationSettings dvbSubDestinationSettings) {
        setDvbSubDestinationSettings(dvbSubDestinationSettings);
        return this;
    }

    /**
     * @param sccDestinationSettings
     */

    public void setSccDestinationSettings(SccDestinationSettings sccDestinationSettings) {
        this.sccDestinationSettings = sccDestinationSettings;
    }

    /**
     * @return
     */

    public SccDestinationSettings getSccDestinationSettings() {
        return this.sccDestinationSettings;
    }

    /**
     * @param sccDestinationSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionDestinationSettings withSccDestinationSettings(SccDestinationSettings sccDestinationSettings) {
        setSccDestinationSettings(sccDestinationSettings);
        return this;
    }

    /**
     * @param teletextDestinationSettings
     */

    public void setTeletextDestinationSettings(TeletextDestinationSettings teletextDestinationSettings) {
        this.teletextDestinationSettings = teletextDestinationSettings;
    }

    /**
     * @return
     */

    public TeletextDestinationSettings getTeletextDestinationSettings() {
        return this.teletextDestinationSettings;
    }

    /**
     * @param teletextDestinationSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionDestinationSettings withTeletextDestinationSettings(TeletextDestinationSettings teletextDestinationSettings) {
        setTeletextDestinationSettings(teletextDestinationSettings);
        return this;
    }

    /**
     * @param ttmlDestinationSettings
     */

    public void setTtmlDestinationSettings(TtmlDestinationSettings ttmlDestinationSettings) {
        this.ttmlDestinationSettings = ttmlDestinationSettings;
    }

    /**
     * @return
     */

    public TtmlDestinationSettings getTtmlDestinationSettings() {
        return this.ttmlDestinationSettings;
    }

    /**
     * @param ttmlDestinationSettings
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CaptionDestinationSettings withTtmlDestinationSettings(TtmlDestinationSettings ttmlDestinationSettings) {
        setTtmlDestinationSettings(ttmlDestinationSettings);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getBurninDestinationSettings() != null)
            sb.append("BurninDestinationSettings: ").append(getBurninDestinationSettings()).append(",");
        if (getDestinationType() != null)
            sb.append("DestinationType: ").append(getDestinationType()).append(",");
        if (getDvbSubDestinationSettings() != null)
            sb.append("DvbSubDestinationSettings: ").append(getDvbSubDestinationSettings()).append(",");
        if (getSccDestinationSettings() != null)
            sb.append("SccDestinationSettings: ").append(getSccDestinationSettings()).append(",");
        if (getTeletextDestinationSettings() != null)
            sb.append("TeletextDestinationSettings: ").append(getTeletextDestinationSettings()).append(",");
        if (getTtmlDestinationSettings() != null)
            sb.append("TtmlDestinationSettings: ").append(getTtmlDestinationSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CaptionDestinationSettings == false)
            return false;
        CaptionDestinationSettings other = (CaptionDestinationSettings) obj;
        if (other.getBurninDestinationSettings() == null ^ this.getBurninDestinationSettings() == null)
            return false;
        if (other.getBurninDestinationSettings() != null && other.getBurninDestinationSettings().equals(this.getBurninDestinationSettings()) == false)
            return false;
        if (other.getDestinationType() == null ^ this.getDestinationType() == null)
            return false;
        if (other.getDestinationType() != null && other.getDestinationType().equals(this.getDestinationType()) == false)
            return false;
        if (other.getDvbSubDestinationSettings() == null ^ this.getDvbSubDestinationSettings() == null)
            return false;
        if (other.getDvbSubDestinationSettings() != null && other.getDvbSubDestinationSettings().equals(this.getDvbSubDestinationSettings()) == false)
            return false;
        if (other.getSccDestinationSettings() == null ^ this.getSccDestinationSettings() == null)
            return false;
        if (other.getSccDestinationSettings() != null && other.getSccDestinationSettings().equals(this.getSccDestinationSettings()) == false)
            return false;
        if (other.getTeletextDestinationSettings() == null ^ this.getTeletextDestinationSettings() == null)
            return false;
        if (other.getTeletextDestinationSettings() != null && other.getTeletextDestinationSettings().equals(this.getTeletextDestinationSettings()) == false)
            return false;
        if (other.getTtmlDestinationSettings() == null ^ this.getTtmlDestinationSettings() == null)
            return false;
        if (other.getTtmlDestinationSettings() != null && other.getTtmlDestinationSettings().equals(this.getTtmlDestinationSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBurninDestinationSettings() == null) ? 0 : getBurninDestinationSettings().hashCode());
        hashCode = prime * hashCode + ((getDestinationType() == null) ? 0 : getDestinationType().hashCode());
        hashCode = prime * hashCode + ((getDvbSubDestinationSettings() == null) ? 0 : getDvbSubDestinationSettings().hashCode());
        hashCode = prime * hashCode + ((getSccDestinationSettings() == null) ? 0 : getSccDestinationSettings().hashCode());
        hashCode = prime * hashCode + ((getTeletextDestinationSettings() == null) ? 0 : getTeletextDestinationSettings().hashCode());
        hashCode = prime * hashCode + ((getTtmlDestinationSettings() == null) ? 0 : getTtmlDestinationSettings().hashCode());
        return hashCode;
    }

    @Override
    public CaptionDestinationSettings clone() {
        try {
            return (CaptionDestinationSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.CaptionDestinationSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
