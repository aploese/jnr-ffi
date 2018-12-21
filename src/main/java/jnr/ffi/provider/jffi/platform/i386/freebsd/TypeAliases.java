/*
 * Copyright (C) 2012 Wayne Meissner
 *
 * This file is part of the JNR project.
 *
 * Licensed under the Apache License, Version 2.0 (the "License";
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jnr.ffi.provider.jffi.platform.i386.freebsd;

import jnr.ffi.TypeAlias;
import jnr.ffi.NativeType;
import java.util.EnumMap;
import java.util.Map;
import jnr.ffi.provider.jffi.NativeTypeLookup;

public final class TypeAliases implements NativeTypeLookup {

    @Override
    public NativeType get(TypeAlias ta) {
        switch (ta) {
            case int8_t:
                return NativeType.SCHAR;
            case u_int8_t:
                return NativeType.UCHAR;
            case int16_t:
                return NativeType.SSHORT;
            case u_int16_t:
                return NativeType.USHORT;
            case int32_t:
                return NativeType.SINT;
            case u_int32_t:
                return NativeType.UINT;
            case int64_t:
                return NativeType.SLONGLONG;
            case u_int64_t:
                return NativeType.ULONGLONG;
            case intptr_t:
                return NativeType.SINT;
            case uintptr_t:
                return NativeType.UINT;
            case caddr_t:
                return NativeType.ADDRESS;
            case dev_t:
                return NativeType.UINT;
            case blkcnt_t:
                return NativeType.SLONGLONG;
            case blksize_t:
                return NativeType.UINT;
            case gid_t:
                return NativeType.UINT;
            case in_addr_t:
                return NativeType.UINT;
            case in_port_t:
                return NativeType.USHORT;
            case ino_t:
                return NativeType.UINT;
            case ino64_t:
                return NativeType.ULONGLONG;
            case key_t:
                return NativeType.SLONG;
            case mode_t:
                return NativeType.USHORT;
            case nlink_t:
                return NativeType.USHORT;
            case id_t:
                return NativeType.SLONGLONG;
            case pid_t:
                return NativeType.SINT;
            case off_t:
                return NativeType.SLONGLONG;
            case swblk_t:
                return NativeType.SLONG;
            case uid_t:
                return NativeType.UINT;
            case clock_t:
                return NativeType.ULONG;
            case size_t:
                return NativeType.UINT;
            case ssize_t:
                return NativeType.SINT;
            case time_t:
                return NativeType.SINT;
            case fsblkcnt_t:
                return NativeType.ULONGLONG;
            case fsfilcnt_t:
                return NativeType.ULONGLONG;
            case sa_family_t:
                return NativeType.UCHAR;
            case socklen_t:
                return NativeType.UINT;
            case rlim_t:
                return NativeType.SLONGLONG;
            case cc_t:
                return NativeType.UCHAR;
            case speed_t:
                return NativeType.UINT;
            case tcflag_t:
                return NativeType.UINT;
        }
        return null;
    }
}
