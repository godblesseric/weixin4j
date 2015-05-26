/*
 * 微信公众平台(JAVA) SDK
 *
 * Copyright (c) 2014, Ansitech Network Technology Co.,Ltd All rights reserved.
 * 
 * http://www.weixin4j.org/sdk/
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.weixin4j.message;

/**
 * 这个类实现了<tt>OutputMessage</tt>，用来回复图片消息
 *
 * <p>提供了获取图片Id<code>getMediaId()</code>等主要方法.</p>
 *
 * @author weixin4j<weixin4j@ansitech.com>
 */
public class ImageOutputMessage extends OutputMessage {

    /**
     * 消息类型:图片消息
     */
    private String MsgType = "image";
    /**
     * 通过上传多媒体文件，得到的id
     */
    private Image Image;

    /**
     * 创建一个新的 Output Message.并且MsgType的值为image.
     */
    public ImageOutputMessage() {
    }

    /**
     * 创建一个自定义图片Id mediaId的Output Message.
     *
     * @param MediaId 图片资源Id
     */
    public ImageOutputMessage(Image image) {
        this.Image = image;
    }

    /**
     * 获取 消息类型
     *
     * @return 消息类型
     */
    @Override
    public String getMsgType() {
        return MsgType;
    }

    /**
     * 获取 通过上传多媒体文件，得到的id
     *
     * @return 通过上传多媒体文件，得到的id封装的image对象
     */
    public Image getImage() {
        return this.Image;
    }

    /**
     * 设置 通过上传多媒体文件，得到的id
     *
     * @param image 通过上传多媒体文件，得到的id封装的image对象
     */
    public void setImage(Image image) {
        this.Image = image;
    }
}