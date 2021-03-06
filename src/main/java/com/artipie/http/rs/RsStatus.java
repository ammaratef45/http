/*
 * MIT License
 *
 * Copyright (c) 2020 Artipie
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.artipie.http.rs;

/**
 * HTTP response status code.
 * See <a href="https://tools.ietf.org/html/rfc2616#section-6.1.1">RFC 2616 6.1.1 Status Code and Reason Phrase</a>
 *
 * @since 0.4
 */
public enum RsStatus {

    /**
     * OK.
     */
    OK("200"),

    /**
     * Created.
     */
    CREATED("201"),

    /**
     * Accepted.
     */
    ACCEPTED("202"),

    /**
     * No Content.
     */
    NO_CONTENT("204"),

    /**
     * Moved Permanently.
     */
    MOVED_PERMANENTLY("301"),

    /**
     * Found.
     */
    FOUND("302"),

    /**
     * Not Modified.
     */
    NOT_MODIFIED("304"),

    /**
     * Temporary Redirect.
     */
    @SuppressWarnings("PMD.LongVariable")
    TEMPORARY_REDIRECT("307"),

    /**
     * Bad Request.
     */
    BAD_REQUEST("400"),

    /**
     * Unauthorized.
     */
    UNAUTHORIZED("401"),

    /**
     * Forbidden.
     */
    FORBIDDEN("403"),

    /**
     * Not Found.
     */
    NOT_FOUND("404"),

    /**
     * Method Not Allowed.
     */
    @SuppressWarnings("PMD.LongVariable")
    METHOD_NOT_ALLOWED("405"),

    /**
     * Request Time-out.
     */
    REQUEST_TIMEOUT("408"),

    /**
     * Conflict.
     */
    CONFLICT("409"),

    /**
     * Requested Range Not Satisfiable.
     */
    BAD_RANGE("416"),

    /**
     * Internal Server Error.
     */
    INTERNAL_ERROR("500"),

    /**
     * Not Implemented.
     */
    NOT_IMPLEMENTED("501"),

    /**
     * Service Unavailable.
     */
    UNAVAILABLE("503");

    /**
     * Code value.
     */
    private final String string;

    /**
     * Ctor.
     *
     * @param string Code value.
     */
    RsStatus(final String string) {
        this.string = string;
    }

    /**
     * Code as 3-digit string.
     *
     * @return Code as 3-digit string.
     */
    public String code() {
        return this.string;
    }
}
